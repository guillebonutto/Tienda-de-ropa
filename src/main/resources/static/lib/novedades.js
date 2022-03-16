var app = new Vue({
    el:"#app",
    data:{
        prendas:[]

    },
    methods: {
        cargarDatos(){
            axios
            .get('/api/prendas')
            .then((response)=>{
                this.prendas = response.data

            })
            .catch((error)=>{
                console.log(error)
            })

    }
}

})