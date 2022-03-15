var app = new Vue({
    el:'#app',
    data: {
        prendas: [],
        prendasMarroquineria: [],
        buscador: '',
        setTimeoutBuscador: ''

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
      
    created() {
        this.cargarDatos();
       
    },

    methods: {
        cargarDatos(){
            axios
            .get('/api/prendas')
            .then((response)=>{
                this.prendas = response.data
                this.cargarPrendasMarroquinería();

            })
            .catch((error)=>{
                console.log(error)
            })
            
        },

        cargarPrendasMarroquinería() {
            this.prendasMarroquineria = this.prendas.filter(element=> element.tipoArticulo == "MARROQUINERIA")
        },
        		cargarPrendasMarroquinería() {
			this.prendasMarroquinería = this.prendas.filter(
				(element) => element.tipoArticulo == "MARROQUINERIA"
			)
		},
		filtroCategorias(categoria) {
			this.prendasMarroquinería = this.prendasMarroquinería.filter((element) =>
				element.nombrePrenda.includes(categoria)
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
		filtroColor(color) {
			this.prendasMarroquinería = this.prendasMarroquinería.filter((element) =>
				element.nombrePrenda.includes(color)
			)
		},
		buscador() {
			this.prendasMarroquinería.forEach((element) => {
				if (
					element.nombrePrenda.toLowerCase().includes(element.nombrePrenda.toLowerCase()) ||
					this.buscar == ""
				) {
					this.prendasMarroquinería = this.prendasMarroquinería.filter((elemento) =>
						elemento.nombrePrenda.toLowerCase().includes(this.buscar.toLowerCase())
					)
				}
			})
		},
	},


    },
    computed:{
        filtrarPrendas(){
            return this.prendasMarroquineria.filter(prenda => prenda.nombrePrenda.toLowerCase().includes(this.buscador.toLowerCase()))
            
        }
    }

})
