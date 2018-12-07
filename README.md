

# Banco de iniciativas


### Circleci [![CircleCI](https://circleci.com/gh/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre.svg?style=svg)](https://circleci.com/gh/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre) 
![Maven](https://img.shields.io/badge/Maven-3.3.9-blue.svg?style=for-the-badge&logoColor=white) ![Github](https://img.shields.io/badge/Version-1.0-brightgreen.svg?style=for-the-badge&logo=github&logoColor=white) ![Java](https://img.shields.io/badge/Java-1.8.0-blue.svg?style=for-the-badge&logo=java&logoColor=white) [![Heroku](https://img.shields.io/badge/Heroku-App-blue.svg?style=for-the-badge&logo=heroku&logoColor=white)](https://dashboard.heroku.com/apps/bancoiniciativa)

### 2018-2 PDSW

|Miembros| Rol |
|:--:|:--:|
| Francisco Jose Chaves Alonso | Product Owner |
| Santiago Andres Alzate Serna | Product Owner |
| Jimmy Andres Moya | ScrumMaster |
| Juan Felipe Mora | Equipo de desarrollo |
| Nicolas D. Cardenas G.| Equipo de desarrollo |

### Descripción
1. **Descripción del proyecto**
	* Descripción general
		* El Proyecto consiste en la elaboración de un aplicativa para el registro y seguimiento de las intenciones propuestas por los usuarios de la Escuela Colombiana de Ingeniería Julio Garavito. 
	* Imágenes de funciones
		* Página de inicio![pagina de inicio](https://raw.githubusercontent.com/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre/master/image/pagina_saludo.PNG "pagina de inicio")
		* Página de login![Login](https://raw.githubusercontent.com/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre/master/image/login.PNG "Login")
		*Página del administrador![pagina admin](https://raw.githubusercontent.com/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre/master/image/admin.PNG "pagina del administrador")
		* Consulta todos los usuario registrados![consulta usuarios](https://raw.githubusercontent.com/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre/master/image/consultaUser.PNG "pagina de consulta de usuarios")
		* Consulta particular de un usuario![consulta usuario](https://raw.githubusercontent.com/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre/master/image/consultaUserP.PNG "pagina de consulta de usuarios")
		* Listar todas las intenciones registradas![consulta intenciones](https://raw.githubusercontent.com/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre/master/image/listIntencion.PNG "pagina de consulta de intenciones")
		* Consulta específica de una intención por palabra clave![consulta intencion](https://raw.githubusercontent.com/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre/master/image/buscarIntencion.PNG "pagina de consulta de intencion")
		* Registrar una intención![registro intenciones](https://raw.githubusercontent.com/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre/master/image/registrarIntencion.PNG "pagina de registro de intenciones")
> Usuarios con diferente rol

|Usuario| Contraseña | Rol |
|--|--|--|
| sudo@escuelaing.edu.co | root | Administrador |
| juan.mora@mail.escuelaing.edu.co | password | Personal PMO - ODI |
| diana.torres@mail.escuelaing.edu.co | password | Proponente de iniciativa o idea de proyecto |
| suly.jaimes@mail.escuelaing.edu.co | password | Usuarios de consulta |

2.  **Arquitectura y Diseño detallado**
	* Modelo E-R
	
	![Class Diagram](http://www.plantuml.com/plantuml/png/TLB1RXen43t7Ns5n2bL1q8fB54LfaLgXNdf8A_Mq6dOdOE6rL-FPegZglySsEDWHveBtlV5xRsRyw1Y8nruBTr1c089UjXgSa__4pLTe3pkoe-dMLbkIMktstBw04JTVYEpnX3A2zhMMEgGJuZGmRlM8udycwnW9BRyCk7ul_0UrjiVlX6Y4OBj3tYFv15BASvfVRWHIDaFMjaV3xy3VbeEfU6fO3LPEbXCvcyd9OZx_C4aQKgH3IOUx9PUep4kAZM5_LjOaSXOabXVvEyaA3UQ5GQiqgbULdXN5P9qEJyq06hO4JehRjxAF6JwLS_-b0jLwAk52d0Pt6jXvvFVtFtyyFCZH8JMgy_R-MYJ2ylpdNw1s3tIxMap3i8iDbHBfjepWywXrOw3FDJwjLjD8OWzANoCw780u3AC1GYZzOyNW_O-Mkepw7AYOuvlFSMwlAJgIb-nX8zU3Hqoh0pQTSk7VmrjhDOB9zLKQ-PjwpWPRTs6IRRxYkdbhetRHTjbSqLKzLUczILpTkgxl6BXSuhIITRb8OJjWREnpqn92zBsBKEHOiSOhYvtvtoLoziZhcHbsbHTwxVaNGgdVJMMPUT4bJBbOiLSTobPHgr4yekd6Nhy2)
	* Diagrama de clases
	![Class Diagram](http://www.plantuml.com/plantuml/png/j5RRRkCs47rUVmMnJraqpWSi3AE9qqk0NNHHRn-AnI8OKnEP3KsgCoEdGRh_Nb8IBPco4WHj_HBfp6M6PyvG-Pu5IEgTdV6zSHKGx9IsmAoUPc-kGD-Nv6jNhBprfAmfjw8VmStUN1BvXnOL11jyFHL8BS8M13UsnjctGLeM9FJoME4gJ_mxMkiVVY94DvjLmGWbghVen8X1VXjwwPhwZP7IyyhlTi4blTuuYG7UXQ9zZXsuy9Ss2AxDSmMCdm9q5H2r-7i-duUaDP3n7A4J3kg3BusRCFPb6-YeTeN4XeDPOopTD7zz-Okwk5YgJxtjXxyqLatZVRBdtJu-Ne4OJldcysNAVR3rcJg78T2syX6g2aajBYwoX8C-CfyiyT5f6MblT3Uj8QLg7dzD2qOCYDdZ5RZxTUUltgl5mhW_KCjoEKjalp8i6yFhAwwHEKJ7auRVOEGJEMvsbLNFbCZZqlHYXOcOqVYZ0AQhPwU8itjzM1XWsZ8r_x8rHO7kwrnnQccuFhs36YXxDkitCqu-_ERA5A6CSQAwzxlQsbi7EmpmMiYuiZFW3epDGI24Qwo09EvtRZKkrerClky9wspQEo5WT0RoC36LxrJPcyBnZ-wIqG46UK-qKgTypUcVxIzLwg6fMiW2XH-tBxKTeGMo9bF5Qhdf3lKMLeJG6Qz1CF5RYwVZfYkmi27WbOKz1jCb4Jn-C2oBDkao4T7on4Sk7NdBmVYEA8OD2u6Mxg8Utg4z2L6HRLittMDZ-IvOZ9oz2_ZUcwBdCTqmMPQ9VP_Qk2Pg3tQDG7gRSxWLgRgB8PX-xj-wragKo67JNNpeuPLtN5kvjBOnDZH5ZsNdWb6dr1-hHGaBGwXbdHiOhCczOvaVZIiuhv0eIfVOl-Rdr8vMmFpWgNXv9KAdK3UQruqMysDON_fQUdIyAV_dY5b0C0Edrhq0mLj_Twi9GKPR9KRiA9EleYCVu2zVKrsqg0KZVzcQ_VV2En2Pr1SFG0rwQY0XzZEK7E2yjrnsUVvfTUSYdfPyRhXnOsbCVbkVkk09-zcEoyCetht2zrmXKNZxl2N_01kBBmNdxjbIfjccVf-Y38t-5idjRE7K-UHppr-H_woHPU1AUnln1eurZHEaEz1u_Bz5ggjRjS24NDHYSUeVq6MQCpShTV0_wxuYFSNZb1CP9vHfYgZkzlDudktg-MXDpxCTJBfvwHWboad1JyOTCnjRF4LgnF_fnGfk40PYs3hCa1T3b06GG7o0HwM-kZo2DiBdms05mHF1XKiSsxcmEEkG_TbDexj9TG-JvR-75pEFTnzAKGoviqHDGzRZXP_t9zJA-rqJGMAQhDou9ioLBuIG0BY1G69x9fJYQ8PLucQfZ4QneoegwUCWw_hLalO_hMIBf5sE1IXlqQYTro2o2POC7aCGsQq5ynTGlXN5UF8hI12ZeLSWkIAfbTfOxWW3TK2MHGRTchyKLaq_z7sQJXecJViGRBxScWIiK0pTj-MzfEBTnSdiYIAP0gzvhA50UF-_sxbx2ttgGCgrS-jHf_kpmQHUIZjjMFJDlX3wRgXY3ZklRxV7ws6wd6y0)
	* Descripción de la arquitectura
	* [Enlace a la aplicación en Heroku](https://bancoiniciativa.herokuapp.com)
3. Descripción del proceso
	*	Breve descripción de la Metodología
		*	Es implementó la metodología de scrum, con los principios de las técnicas ágiles para el desarrollo del proyecto, constantemente los integrantes rotaron de roles y se programaba por parejas.
	*	[Enlace a Trello](https://trello.com/b/RXskY0mL/2018-2-proypdsw-lossinnombre)
	*	Release-burndown chart
4. Manual de Usuario
	** [Enlace del manual de usuario] (https://github.com/NicoCardenas/PDSW-2018-1-PROYECTO-LosSinNombre/blob/master/ManualDeUsuario.pdf)

***

### Para hacer pull
>git pull

### Configurar
> 1. git config --global user.name usuario
> 2. git config --global user.email correo

### Para hacer push
> 1. git add .
> 2. git commit -m "mensaje"
> 3. git push