var app = new Vue({
	el: "#app",
	data: {
		prendas: [],
		prendasMarroquinería: [],
		filterPrecio: [],
	},
	created() {
		this.cargarDatos()
	},

	methods: {
		cargarDatos() {
			axios
				.get("/api/prendas")
				.then((response) => {
					this.prendas = response.data
					this.cargarPrendasMarroquinería()
				})
				.catch((error) => {
					console.log(error)
				})
		},

		cargarPrendasMarroquinería() {
			this.prendasMarroquinería = this.prendas.filter(
				(element) => element.tipoArticulo == "MARROQUINERIA"
			)
		},
		filtroCategorias(categoria) {
			this.prendasMarroquinería = this.prendas.filter((element) =>
				element.nombrePrenda.contains(categoria)
			)
		},
		filtroPrecio(precioDesde, precioHasta) {
			this.prendasMarroquinería.forEach((precio) => {
				if (
					this.prendasMarroquinería.precio >= precioDesde &&
					this.prendasMarroquinería.precio <= precioHasta
				) {
					this.filterPrecio.push(precio)
				} else {
					this.filterPrecio = []
				}
			})
		},
	},
})
