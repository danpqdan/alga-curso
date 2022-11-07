CREATE TABLE ocorrencia(
    id BIGINT not null auto_increment,
    entrega_id bigint not null,
    descricao text not null,
    data_registro datetime not null,

    primary key (id)
);

ALTER TABLE ocorrencia add constraint fk_ocorrencia_entrega foreign key(entrega_id) references entrega(id)