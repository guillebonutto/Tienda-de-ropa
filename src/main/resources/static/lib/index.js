var app = new Vue({
	el: "#app",
	data: {
		message: "Hello Vue!",
		collap: "collapsed",
		email:"",
		password: "",
	},
	created() {},
	methods: {
		expandir() {
			if (this.collap == "collapsed") {
				this.collap = "expanded"
			} else {
				this.collap = "collapsed"
			}
		},
		
		login() {
            axios
                .post('/api/login', `email=${this.email}&password=${this.password}`, { headers: { 'content-type': 'application/x-www-form-urlencoded' } })

                .then(response => {
                    window.location.href = "web/index.html"

                })
                .catch(error => {
                    Swal.fire({
                        icon: 'error',
                        title: 'Error',
                        text: 'El usuario ingresado no es correcto'
                    })
                })
        },
	},
})
