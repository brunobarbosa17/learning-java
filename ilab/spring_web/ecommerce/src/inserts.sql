select * from pedido;
/* 4 pedidos */
/* 1 cliente 1 compra 3 mouses */
insert into pedido values (null, '2022-03-11', 150,0.0,150,1);
insert into pedido_produto values (null, 2, 1, 3, 50, 150);

/* 2 - cliente 2 compra 2 toalhas e 3 travesseiros */
insert into pedido values (null, '2022-03-11', 140, 0, 140, 2);
insert into pedido_produto values (null, 3, 2, 2, 25, 50);
insert into pedido_produto values (null, 4, 2, 3, 30, 90);

/* 3 - cliente 3 compra 1 ar condicionado */
insert into pedido values (null, '2022-03-11',1500, 100, 1400, 3);
insert into pedido_produto values (null, 5, 3, 1, 1500, 1500);

/* 4 - cliente 4 compra 1 cafeteria e 1 microondas */
insert into pedido values (null, '2022-03-11', 900,0,900, 4);
insert into pedido_produto values (null, 7, 4, 1, 400, 400);
insert into pedido_produto values (null, 8, 4, 1, 500, 500);