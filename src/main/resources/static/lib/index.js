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
		exit(){
			axios.post('/api/logout')
			.then(response => {
				window.location.href ="/login.html"
			})
			.catch((error) => {

			  console.log(error)
			})}
	},
})
