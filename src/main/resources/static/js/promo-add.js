var app = new Vue({
	el: "#homeindex",
	data() {
		return {
			val: {
				titulo: '',
				linkPromocao: '',
				site: '',
				descricao: '',
				linkImagem: '',
				preco: '',
			}

		}
	},
	mounted() {

	},
	methods: {
		get() {
			this.val.site = ''
			this.val.linkImagem = ''
			this.val.titulo = ''

			$("#alert").removeClass("alert alert-danger").text("")
			let fd = new FormData();
			fd.append('url', this.val.linkPromocao)
			axios.post("/meta/info", fd).then((resp) => {
				console.log(resp.data)
				this.val.site = resp.data.site.replace("@", '')
				this.val.linkImagem = resp.data.image
				this.val.titulo = resp.data.title
			}).catch((error) => {
				$("#alert").addClass("alert alert-danger").text("Não foi possível recuperar os dados")
			})
		}, 
		salvar(){
			
			// axios.post("/promocao/save", this.val).then((resp)=>{
			// 	console.log(resp)
			// }).catch((error)=>{
			// 	console.log(error)
			// })
			$.ajax({
				method: "POST",
				url: "/promocao/save",
				data: this.val,
				beforeSend: function() {

				},
				statusCode: {
					422: function(xhr){
						console.log('status erros', xhr.status)
						var errors = $.parseJSON(xhr.responseText)
						$.each(errors, function(key, val){
							$("#"+key).addClass('is-invalid')
							$("#error-" + key).addClass('invalid-feedback').append("<span>"+val+"</span>")
						})
					}
				},
				success: function() {
					$("#alert").addClass("alert alert-success").text("Dados salvos!")

					$("#form-add-promo").each(function() {
						this.reset();
					});
				},
				error: function(xhr) {
					$("#alert").addClass("alert alert-danger").text("Não foi possível recuperar os dados")
				},

			});
		}
	}
})