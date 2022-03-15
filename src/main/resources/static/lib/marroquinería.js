var app = new Vue({
    el:'#app',
    data: {
        prendas: [],
        prendasMarroquineria: [],
        buscador: '',
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
                this.cargarPrendasMarroquinería();

            })
            .catch((error)=>{
                console.log(error)
            })
            
        },

        cargarPrendasMarroquinería() {
            this.prendasMarroquineria = this.prendas.filter(element=> element.tipoArticulo == "MARROQUINERIA")}

        ,
        


    },
    computed:{
        filtrarPrendas(){
            return this.prendasMarroquineria.filter(prenda => prenda.nombrePrenda.toLowerCase().includes(this.buscador.toLowerCase()))
            
        }
    }

})