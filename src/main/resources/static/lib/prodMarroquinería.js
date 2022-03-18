var app = new Vue({
	el: "#app",
	data: {
		prendas: [],
		prendasMarroquineria: [],
		buscar: "",
		setTimeoutBuscador: "",
		carrito: [],
		total: 0,
	},
	created() {
		this.cargarDatos()
	},

	methods: {
		cargarDatos() {
			axios.get("/api/carrito").then((response) => {
				this.carrito = response.data
			})
			axios
				.get("/api/prendas")
				.then((response) => {
					this.prendas = response.data
					this.cargarPrendasMarroquineria()
				})
				.catch((error) => {
					console.log(error)
				})
		},

		cargarPrendasMarroquineria() {
			this.prendasMarroquineria = this.prendas.filter(
				(element) => element.tipoArticulo == "MARROQUINERIA"
			)
		},
		cargarPrendasMarroquineria() {
			this.prendasMarroquineria = this.prendas.filter(
				(element) => element.tipoArticulo == "MARROQUINERIA"
			)
		},
		filtroCategorias(categoria) {
			this.prendasMarroquineria = this.prendasMarroquineria.filter((element) =>
				element.nombrePrenda.includes(categoria)
			)
		},
		filtroPrecio(precioDesde, precioHasta) {
			this.prendasMarroquineria.forEach((precio) => {
				if (
					this.prendasMarroquineria.precio >= precioDesde &&
					this.prendasMarroquineria.precio <= precioHasta
				) {
					this.filterPrecio.push(precio)
				} else {
					this.filterPrecio = []
				}
			})
		},
		filtroColor(color) {
			this.prendasMarroquineria = this.prendasMarroquineria.filter((element) =>
				element.nombrePrenda.includes(color)
			)
		},
		buscadorr() {
			this.prendasMarroquineria.forEach((element) => {
				if (
					element.nombrePrenda.toLowerCase().includes(element.nombrePrenda.toLowerCase()) ||
					this.buscar == ""
				) {
					this.prendasMarroquineria = this.prendasMarroquineria.filter((elemento) =>
						elemento.nombrePrenda.toLowerCase().includes(this.buscar.toLowerCase())
					)
				}
			})
		},
		agregarCarrito(nombrePrenda, cant, monto, montoTotal) {
			this.total += montoTotal
			axios.get("/api/carrito").then((response) => {
				this.carrito = response.data
			})
			axios
				.post(
					"/api/carrito",
					`nombrePrenda=${nombrePrenda}&cantidad=${cant}&monto=${monto}&montoTotal=${this.total}`
				)
				.then((response) => {
					Swal.fire({
						icon: "success",
						text: "Artículo agregado al carrito correctamente",
						timer: 1500,
					})
				})
		},
	},
	computed: {
		filtrarPrendas() {
			return this.prendasMarroquineria.filter((prenda) =>
				prenda.nombrePrenda.toLowerCase().includes(this.buscar.toLowerCase())
			)
		},
	},
})
