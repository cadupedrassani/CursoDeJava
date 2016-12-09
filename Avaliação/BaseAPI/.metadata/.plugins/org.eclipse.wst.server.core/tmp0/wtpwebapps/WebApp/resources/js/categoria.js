function consultarCategoria(){
	
	var idCategoria = $('#cod-categoria').val();
	var operacao = '/ControleAPI/categoria/' + idCategoria;
	
	$.ajax({
		url: operacao
	}).done(function(data){
		console.log(data);
		if(data.mensagem != null && data.mensagem != ""){
			$('#descricao-categoria').html(data.mensagem);
		} else{
			$('#descricao-categoria').html(data.descricao);
		}
	});
}

function cadastrarCategoria(){
	
	var descricao = $("#descricao-categoria").val();
	var categoriaDTO = new Object();
	var operacao = "/ControleAPI/categoria/criarCategoria"
		
	categoriaDTO.descricao = descricao;
	
	$.ajax({
		method: "POST",
		url: operacao,
		data: JSON.stringify(categoriaDTO),
		contentType: "application/json"
	}).done(function (data){
		var mensagem = "";
		var titulo = "";
		if(data.mensagem != undefined && data.mensagem != null && data.mensagem != ''){
			titulo = "Atenção";
			mensagem = data.mensagem;
		}else{
			titulo = 'Sucesso';
			mensagem = "Categoria cadastrada com sucesso.";
		}
		mostrarModal(titulo, mensagem)
	});
}

function mostrarModal(titulo, mensagem){
	
	$('#modal-title').html(titulo);
	$('#modal-mensagem').html(mensagem);
	$('#modal-mensagens').modal('show');
}


