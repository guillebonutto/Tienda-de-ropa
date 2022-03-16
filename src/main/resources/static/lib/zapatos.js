var app = new Vue({
    el:'#app',
    data: {
        prendas: [],
        zapatos: [],
        buscador: '',
        setTimeoutBuscador: '',
        tildes: {'á':'a', 'é':'e', 'è':'e', 'í':'i','ó':'o','ú':'u','Á':'a', 'É':'e', 'è':'e', 'Í':'i','Ó':'o','Ú':'u'}


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
        accent(s) {
            if (!s) { return ''; }
            var ret = '';
            for (var i = 0; i < s.length; i++) {
              ret += this.tildes[s.charAt(i)] || s.charAt(i);
            }
            return ret;
          }


    },
    computed:{
        filtrarPrendas(){
            return this.zapatos.filter(prenda => prenda.nombrePrenda.toLowerCase().includes(this.buscador.toLowerCase()))
            
        }
    }

})