var app = new Vue({
    el:'#app',
    data: {
        prendas: [],
        prendasIndumentaria: [],
        buscar: '',
        setTimeoutBuscador: ''
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
                this.cargarprendasIndumentaria();

            })
            .catch((error)=>{
                console.log(error)
            })
            
        },

        cargarprendasIndumentaria() {
            this.prendasIndumentaria = this.prendas.filter(element=> element.tipoArticulo == "MARROQUINERIA")
        },
        		cargarprendasIndumentaria() {
			this.prendasIndumentaria = this.prendas.filter(
				(element) => element.tipoArticulo == "MARROQUINERIA"
			)
		},
		filtroCategorias(categoria) {
			this.prendasIndumentaria = this.prendasIndumentaria.filter((element) =>
				element.nombrePrenda.includes(categoria)
			)
		},
		filtroPrecio(precioDesde, precioHasta) {
			this.prendasIndumentaria.forEach((precio) => {
				if (
					this.prendasIndumentaria.precio >= precioDesde &&
					this.prendasIndumentaria.precio <= precioHasta
				) {
					this.filterPrecio.push(precio)
				} else {
					this.filterPrecio = []
				}
			})
		},
		filtroColor(color) {
			this.prendasIndumentaria = this.prendasIndumentaria.filter((element) =>
				element.nombrePrenda.includes(color)
			)
		},
		buscadorr() {
			this.prendasIndumentaria.forEach((element) => {
				if (
					element.nombrePrenda.toLowerCase().includes(element.nombrePrenda.toLowerCase()) ||
					this.buscar == ""
				) {
					this.prendasIndumentaria = this.prendasIndumentaria.filter((elemento) =>
						elemento.nombrePrenda.toLowerCase().includes(this.buscar.toLowerCase())
					)
				}
			})
		},
	},
    computed:{
        filtrarPrendas(){
            return this.prendasIndumentaria.filter(prenda => prenda.nombrePrenda.toLowerCase().includes(this.buscar.toLowerCase()))
            
        }
    }
    

})
