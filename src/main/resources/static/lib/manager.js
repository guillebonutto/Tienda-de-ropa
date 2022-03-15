var app = new Vue({
    el: '#app',
    data: {
        clientes: [],
        prendas: [],
        nombre: "",
        apellido: "",
        email: "",
        nombrePrenda: "",
        tipo: "",
        talles: [],
        precio: 0,
        stock: 0,
        imagen: "estamos",
        json: "",
        


    },

    created() {
        this.cargarDatos();
        this.cargarPrendas();
    },

    methods: {
        cargarDatos() {
            axios
                .get("/rest/clientes")
                .then((response) => {

                    this.clientes = response.data._embedded.clientes
                    this.json = response.data

                })
                .catch((error) => {

                    console.log(error)
                })

        },
        cargarPrendas() {
            axios
                .get('/api/prendas')
                .then((response) => {
                    this.prendas = response.data


                })
                .catch((error) => {

                    console.log(error)
                })
        },
        crearPrendas() {
            axios

                .post('/api/prendas', `nombrePrenda=${this.nombrePrenda}&precio=${this.precio}&stock=${this.stock}&tipo=${this.tipo}&talles=${this.talles}&imagen=${this.imagen}`)
                .then((response) =>{
                    window.location.reload()
                })
                .catch((error) => {
                console.log(error)
                })
        },

        formulario(){
            return false
        },

        eliminarCuentas(){
            axios
                .delete('/api/prendas{Id}')
                .then((response) => {
                    window.location.reload()
                })
                .catch((error) => {
                    console.log(error)
                    })
        },

        // cargarTalles(){
        //     this.talles= 
        // },



    },




})