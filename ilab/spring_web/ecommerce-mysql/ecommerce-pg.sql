create database ecommerce_ifood;

create table departamento(
	numero serial not null primary key, 
	nome   varchar(50) not null, 
	andar  integer
);
  

create table cliente(
	numero      serial not null primary key, 
	nome        varchar(100) not null, 
	cpf         varchar(11) not null unique, 
	email       varchar(50) not null unique, 
	telefone    integer not null, 
	logradouro  varchar(50) not null , 
    num_res     integer, 
	compl       varchar(30), 
	bairro      varchar(30), 
	cidade      varchar(30), 
	estado      char(2) not null, 
	cep         char(8)
);
  
create table produto(
	codigo serial not null  primary key, 
	nome varchar(50) not null, 
	descricao text, 
	preco double precision, 
	qtd_estoque integer, 
    link_foto varchar(255), 
	num_depto integer not null,
	
	constraint fk_depto foreign key (num_depto) references departamento(numero)
);
    

create table pedido(
	numero serial not null primary key, 
	data date, 
	valor_bruto double precision, 
	desconto double precision, 
    valor_total double precision, 
	num_cliente integer not null,
	constraint fk_ped_cliente foreign key (num_cliente) references cliente (numero)
);
    

create table pedido_produto(
	num_seq      serial not null primary key, 
	cod_produto  integer not null, 
	num_pedido   integer not null, 
    quantidade   integer, 
	preco_unit   double precision, 
	preco_total  double precision,
	constraint fk_prod foreign key (cod_produto) references produto(codigo),
	constraint fk_pedido foreign key (num_pedido) references pedido(numero)
);
    