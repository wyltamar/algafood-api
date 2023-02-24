insert into cozinha(nome) values ('Tailandesa');
insert into cozinha(nome) values ('Indiana');
insert into restaurante(nome,taxa_frete,cozinha_id) values('Bom Gosto',10,1);
insert into restaurante(nome,taxa_frete,cozinha_id) values('Sabor da Terra',20,2);
insert into restaurante(nome,taxa_frete,cozinha_id) values('Point da Pizza',15,1);
insert into forma_pagamento(descricao,restaurante_id)values('cartão de crédito',1);
insert into forma_pagamento(descricao,restaurante_id)values('pix',2);