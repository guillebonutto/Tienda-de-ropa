var app = new Vue({
    el:'#app',
    data: {
        prendas: [],
        prendasMarroquinería: [],


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
            this.prendasMarroquinería = this.prendas.filter(element=> element.tipoArticulo == "MARROQUINERIA")}


    },

})