
use ecommerce_ilab_ifood;

CREATE TABLE departamento (
  numero INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  andar INTEGER 
);

CREATE TABLE cliente(
  numero INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  cpf VARCHAR(14) NOT NULL UNIQUE,
  email VARCHAR(05) NOT NULL UNIQUE,
  telefone integer not null,
  logradouro varchar(50) not null,
  numero_residencia integer,
  complemento varchar(30),
  bairro varchar(30),
  cidade varchar(30),
  estado  char(2) not null,
  cep char(8)
);

CREATE TABLE produto (
  codigo integer not NULL AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  descricao TEXT,
  preco DOUBLE,
  quantidade_estoque INTEGER,
  link_foto VARCHAR(255),
  num_depto INTEGER NOT NULL,

  CONSTRAINT fk_depto FOREIGN KEY (num_depto)
  references departamento(numero)
);

CREATE TABLE pedido (
  numero INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  data date,
  valor_bruto double,
  desconto double,
  valor_total double,
  num_cliente integer not null,
  
  CONSTRAINT fk_ped_cliente FOREIGN KEY (num_cliente)
  references cliente(numero)
);

CREATE TABLE pedido_produto (
  num_seq integer not null AUTO_INCREMENT PRIMARY KEY,
  cod_produto integer not null,
  num_pedido integer not null,
  quantidade integer,
  preco_unit double,
  preco_total double,

  CONSTRAINT fk_prod foreign key (cod_produto) references produto(codigo),
  CONSTRAINT fk_pedido foreign key (num_pedido) references pedido(numero)
)