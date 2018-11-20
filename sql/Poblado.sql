/*INSERT*/

/*Tipos*/
insert into t_tipos ("type") values ('Administrador');
insert into t_tipos ("type") values ('Personal PMO - ODI');
insert into t_tipos ("type") values ('Proponente de iniciativa o idea de proyecto');
insert into t_tipos ("type") values ('Usuarios de consulta');

/*Usuarios*/
/*Admin*/
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('sudo','sudo@escuelaing.edu.co','null','root',1);
/*Others*/
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Nicolas Cardenas','nicolas.cardenas@mail.escuelaing.edu.co','null','password',2);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Jimmy Moya','jimmy.moya@mail.escuelaing.edu.co','null','password',2);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Juan Mora','juan.mora@mail.escuelaing.edu.co','null','password',2);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Pedro Mayorga','pedro.mayorga@mail.escuelaing.edu.co','null','password',2);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Fabian Heredia','fabian.heredia@mail.escuelaing.edu.co','null','password',3);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Luisa Callejon','luisa.callejon@mail.escuelaing.edu.co','null','password',3);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Laura Bustos','laura.bustos@mail.escuelaing.edu.co','null','password',3);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Diego Plata','diego.plata@mail.escuelaing.edu.co','null','password',3);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Sebastian Delgado','sebastian.delgado@mail.escuelaing.edu.co','null','password',3);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Diana Torres','diana.torres@mail.escuelaing.edu.co','null','password',3);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Suly Jaimes','suly.jaimes@mail.escuelaing.edu.co','null','password',4);
insert into usuario (full_name, email, deparment_area, pass, t_tipos_user_id) 
	values ('Dario Arango','dario.arango@mail.escuelaing.edu.co','null','password',4);
	
/*Intention*/
insert into intention (user_id, state, content, date_of_Creation, title)
	values (5, 'En espera de revisión', 'Seria bueno que quienes usamos cicla, podamos entrar por la entrada peatonal sin tener que dar la vuelta hasta la entrada vehicular y devolverse', TO_DATE('17/10/2018', 'DD/MM/YYYY'), 'Cambio de ingreso bicicletas');
insert into intention (user_id, state, content, date_of_Creation, title)
	values (6, 'Proyecto', 'Se necesita construir un nuevo bloque con salones, para la ampliacion de espacios de clase', TO_DATE('02/09/2018', 'DD/MM/YYYY'), 'Construir nuevo bloque de salones');
insert into intention (user_id, state, content, date_of_Creation, title)
	values (7, 'En revisión', 'Es necesario crear nuevas salas con computadores, ya que se evidencia que casi nunca hay un computador libre para hacer trabajos', TO_DATE('04/11/2018', 'DD/MM/YYYY'), 'Crear nuevas salas de computo');
insert into intention (user_id, state, content, date_of_Creation, title)
	values (8, 'Solucionado', 'Necesitamos cursos pilates en la escuela, para poder mantenernos en forma, no nos gusta el gimnasio', TO_DATE('20/02/2018', 'DD/MM/YYYY'), 'Crear clase de pilates');
insert into intention (user_id, state, content, date_of_Creation, title)
	values (5, 'Solucionado', 'Queremos que la velocidad del internet de la escuela sea mayor, es muy lento y no sirve para hacer trabajos ni para descargar nada', TO_DATE('15/09/2018', 'DD/MM/YYYY'), 'Mejorar la velocidad del internet');
insert into intention (user_id, state, content, date_of_Creation, title)
	values (9, 'En espera de revisión', 'Hay un salon en el bloque G, que en las mañanas siempre le entra todo el sol del día y enceguece a la hora de poner atención a clase, afecta la visibilidad y no se puede ver nada de lo que esta escrito en el tablero', TO_DATE('05/11/2018', 'DD/MM/YYYY'), 'Mejora de Salon');
insert into intention (user_id, state, content, date_of_Creation, title)
	values (5, 'En revisión', 'Sería genial tener una piscina para los estudiantes y que así pueda haber un equipo de natación en la escuela, así mismo para poder desestresarse de la carga de trabajos', TO_DATE('31/10/2018', 'DD/MM/YYYY'), 'Construir Piscina');

/*Comentario*/
insert into comentario (content, user_id, intention_id)
	values('Buena idea compañero!, es un largo recorrido para nosotros los ciclistas', 11, 1);
insert into comentario (content, user_id, intention_id)
	values('Genial! Ahorramos más tiempo', 12, 1);
insert into comentario (content, user_id, intention_id)
	values('Por fin un internet decente', 10, 5);
insert into comentario (content, user_id, intention_id)
	values('Esto si merece la pena, siempre están llenas esas salas', 3, 3);

/*Vote*/
insert into vote (like_dislike, intention_id, users_id)
	values(true, 7, 11);
insert into vote (like_dislike, intention_id, users_id)
	values(false, 5, 11);
insert into vote (like_dislike, intention_id, users_id)
	values(true, 1, 2);
insert into vote (like_dislike, intention_id, users_id)
	values(true, 1, 4);
insert into vote (like_dislike, intention_id, users_id)
	values(false, 1, 6);
insert into vote (like_dislike, intention_id, users_id)
	values(true, 1, 7);
insert into vote (like_dislike, intention_id, users_id)
	values(false, 5, 6);
insert into vote (like_dislike, intention_id, users_id)
	values(true, 6, 5);
insert into vote (like_dislike, intention_id, users_id)
	values(false, 4, 5);
insert into vote (like_dislike, intention_id, users_id)
	values(true, 2, 8);

/*T_Palabras*/
insert into t_palabras (tag)
	values ('Infraestructura');	
insert into t_palabras (tag)
	values ('Cursos');	
insert into t_palabras (tag)
	values ('Profesores');	
insert into t_palabras (tag)
	values ('Movilidad');	
insert into t_palabras (tag)
	values ('Inclusión');	
insert into t_palabras (tag)
	values ('Ocio/Recreacion');	
insert into t_palabras (tag)
	values ('Becas');	
insert into t_palabras (tag)
	values ('Intercambios');	
insert into t_palabras (tag)
	values ('Apoyo Financiero');
	
/*T_intencion_Palabra*/
insert into t_intencion_palabra (intention_id, t_palabras_id, t_palabras_tag)
	values (1, 4, 'Movilidad');
insert into t_intencion_palabra (intention_id, t_palabras_id, t_palabras_tag)
	values (2, 1, 'Infraestructura');
insert into t_intencion_palabra (intention_id, t_palabras_id, t_palabras_tag)
	values (3, 1, 'Infraestructura');
insert into t_intencion_palabra (intention_id, t_palabras_id, t_palabras_tag)
	values (4, 6, 'Ocio/Recreacion');
insert into t_intencion_palabra (intention_id, t_palabras_id, t_palabras_tag)
	values (5, 1, 'Infraestructura');
insert into t_intencion_palabra (intention_id, t_palabras_id, t_palabras_tag)
	values (6, 1, 'Infraestructura');
insert into t_intencion_palabra (intention_id, t_palabras_id, t_palabras_tag)
	values (7, 1, 'Infraestructura');