
var app = new Vue({
    el: '#app',
    data: {
     nombre:"",
	 apellido:"",
	 email:"",
	 contraseña:""
    },
	methods:{
        login(){
             axios.post('/api/login',"email="+this.email+"&password="+this.contraseña )
			 .then((response) => {
				window.location.href="web/index.html"
		})  
		.catch((error) => {
		console.log(error)
			 }) 
        },
		 register(){
			 axios.post('/api/clientes', "nombre="+this.nombre+"&apellido="+this.apellido+"&email="+this.email+"&password="+this.contraseña)
			 .then(response=>this.login())
			 .catch((error)=>{
				 console.log(error)
			 })
		 }
		 }
		
		
	})

      
const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});