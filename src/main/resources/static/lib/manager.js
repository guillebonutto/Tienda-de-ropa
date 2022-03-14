var app = new Vue({
    el: '#app',
    data: {
        clientes: [],
        prendas: [],
        nombre: "",
        apellido: "",
        email: "",
        nombrePrenda: "",
        talle: "",
        color: "",
        stock: 0,
        json:"",


    },

    created() {
        this.cargarDatos();
        this.cargarPrendas();
    },

    methods: {
        cargarDatos() {
            axios
                .get("/api/clientes")
                .then((response) => {

                    this.clientes = response.data
                    this.json= response.data

                })
                .catch((error) => {

                    console.log(error)
                })

        },
        cargarPrendas(){
            axios
            .get('/api/articulos')
            .then((response) => {
                this.prendas = response.data

                
            })
            .catch((error) => {

                console.log(error)
            })
        }


    },




})