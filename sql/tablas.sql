drop table comentario, intention, t_intencion_palabra, t_palabras, t_tipos, usuario, vote;
drop sequence auto_tipo, auto_intencion, auto_palabra, auto_usuario, auto_vote, auto_t_int_pal, auto_comentario;

-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-11-07 19:15:25.553

-- sequences
-- Sequence: auto_comentario
CREATE SEQUENCE auto_comentario
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_intencion
CREATE SEQUENCE auto_intencion
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_palabra
CREATE SEQUENCE auto_palabra
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_t_int_pal
CREATE SEQUENCE auto_t_int_pal
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_tipo
CREATE SEQUENCE auto_tipo
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_usuario
CREATE SEQUENCE auto_usuario
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_vote
CREATE SEQUENCE auto_vote
      NO MINVALUE
      NO MAXVALUE
      NO CYCLE
;

-- tables
-- Table: Comentario
CREATE TABLE Comentario (
    id int  NOT NULL DEFAULT NEXTVAL ('auto_comentario'),
    content varchar(500)  NOT NULL,
    user_id int  NOT NULL,
    intention_id int  NOT NULL,
    CONSTRAINT Comentario_pk PRIMARY KEY (id)
);

-- Table: Intention
CREATE TABLE Intention (
    id int  NOT NULL DEFAULT NEXTVAL ('auto_intencion'),
    user_id int  NOT NULL,
    state varchar(25)  NOT NULL,
    content varchar(1000)  NOT NULL,
    date_of_Creation date  NOT NULL,
    title varchar(50)  NOT NULL,
    CONSTRAINT valite_state CHECK (state in ('En espera de revisión','En revisión','Proyecto','Solucionado')) NOT DEFERRABLE INITIALLY IMMEDIATE,
    CONSTRAINT Intention_pk PRIMARY KEY (id)
);

-- Table: T_intencion_palabra
CREATE TABLE T_intencion_palabra (
    Intention_id int  NOT NULL,
    T_palabras_id int  NOT NULL,
    T_palabras_tag varchar(50)  NOT NULL,
    CONSTRAINT T_intencion_palabra_pk PRIMARY KEY (Intention_id,T_palabras_id,T_palabras_tag)
);

-- Table: T_palabras
CREATE TABLE T_palabras (
    id int  NOT NULL DEFAULT NEXTVAL ('auto_t_int_pal'),
    tag varchar(50)  NOT NULL,
    CONSTRAINT T_palabras_pk PRIMARY KEY (id,tag)
);

-- Table: T_tipos
CREATE TABLE T_tipos (
    user_id int  NOT NULL DEFAULT NEXTVAL ('auto_tipo'),
    type varchar(50)  NOT NULL,
    CONSTRAINT T_tipos_ak_1 UNIQUE (type) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT T_tipos_pk PRIMARY KEY (user_id)
);

-- Table: Usuario
CREATE TABLE Usuario (
    id int  NOT NULL DEFAULT NEXTVAL ('auto_usuario'),
    full_name varchar(255)  NOT NULL,
    email varchar(255)  NOT NULL,
    deparment_area varchar(50)  NOT NULL,
    pass varchar(30)  NOT NULL,
    T_tipos_user_id int  NOT NULL,
    CONSTRAINT email_uk UNIQUE (email) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT valid_email CHECK (email LIKE '%@%escuelaing.edu.co' AND email NOT LIKE '%@%@%') NOT DEFERRABLE INITIALLY IMMEDIATE,
    CONSTRAINT Usuario_pk PRIMARY KEY (id)
);

-- Table: Vote
CREATE TABLE Vote (
    id int  NOT NULL DEFAULT NEXTVAL ('auto_vote'),
    like_dislike boolean  NOT NULL,
    intention_id int  NOT NULL,
    users_id int  NOT NULL,
    CONSTRAINT Vote_ak_1 UNIQUE (intention_id, users_id) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT Vote_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: T_intencion_palabra_Intention (table: T_intencion_palabra)
ALTER TABLE T_intencion_palabra ADD CONSTRAINT T_intencion_palabra_Intention
    FOREIGN KEY (Intention_id)
    REFERENCES Intention (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: T_intencion_palabra_T_palabras (table: T_intencion_palabra)
ALTER TABLE T_intencion_palabra ADD CONSTRAINT T_intencion_palabra_T_palabras
    FOREIGN KEY (T_palabras_id, T_palabras_tag)
    REFERENCES T_palabras (id, tag)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: User_intention (table: Intention)
ALTER TABLE Intention ADD CONSTRAINT User_intention
    FOREIGN KEY (user_id)
    REFERENCES Usuario (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Usuario_T_tipos (table: Usuario)
ALTER TABLE Usuario ADD CONSTRAINT Usuario_T_tipos
    FOREIGN KEY (T_tipos_user_id)
    REFERENCES T_tipos (user_id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: comment_intention (table: Comentario)
ALTER TABLE Comentario ADD CONSTRAINT comment_intention
    FOREIGN KEY (intention_id)
    REFERENCES Intention (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: comment_user (table: Comentario)
ALTER TABLE Comentario ADD CONSTRAINT comment_user
    FOREIGN KEY (user_id)
    REFERENCES Usuario (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: vote_intention (table: Vote)
ALTER TABLE Vote ADD CONSTRAINT vote_intention
    FOREIGN KEY (intention_id)
    REFERENCES Intention (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: vote_users (table: Vote)
ALTER TABLE Vote ADD CONSTRAINT vote_users
    FOREIGN KEY (users_id)
    REFERENCES Usuario (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

delete from usuario;