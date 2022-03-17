var app = new Vue({
    el:'#app',
    data: {
        prendas: [],
        zapatos: [],
        buscador: '',
        setTimeoutBuscador: '',
        tildes: {'á':'a', 'é':'e', 'è':'e', 'í':'i','ó':'o','ú':'u','Á':'a', 'É':'e', 'è':'e', 'Í':'i','Ó':'o','Ú':'u'},
        minPrice:0,
        maxPrice:0,
        value:[]


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
            this.zapatos = this.prendas.filter(element=> element.tipoArticulo == "ZAPATOS")}

        ,
        filtrarPrecio(){
            return this.zapatos.filter(prenda => prenda.precio >= this.minPrice && prenda.precio <= this.maxPrice)
        }


    },
    computed:{
        filtrarPrendas(){
            return this.zapatos.filter(prenda => prenda.nombrePrenda.toLowerCase().includes(this.buscador.toLowerCase()))
            
        },
    }

})