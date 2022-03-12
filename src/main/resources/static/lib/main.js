var app = new Vue({
	el: "#app",
	data: {
		message: "Hello Vue!",
		collap: "collapsed",
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
	},
})
