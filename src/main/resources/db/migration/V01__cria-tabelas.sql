create table noticia (
   id bigint not null auto_increment,
   autor varchar(255),
   data varchar(255),
   subtitulo varchar(255),
   titulo varchar(255),
   url varchar(255),
   primary key (id)
);


create table noticia_conteudo (
   noticia_id bigint not null,
   conteudo text not null
);


alter table noticia_conteudo
add constraint FKp6nngwa0qde1uw6itlira3769
foreign key (noticia_id)
references noticia (id);