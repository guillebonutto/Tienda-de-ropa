var app = new Vue({
    el:'#app',
    data: {
        prendas: [],
        zapatos: [],
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
            this.zapatos = this.prendas.filter(element=> element.tipoArticulo == "ZAPATOS")}

        ,
        


    },
    computed:{
        filtrarPrendas(){
            return this.zapatos.filter(prenda => prenda.nombrePrenda.toLowerCase().includes(this.buscador.toLowerCase()))
            
        }
    }

})