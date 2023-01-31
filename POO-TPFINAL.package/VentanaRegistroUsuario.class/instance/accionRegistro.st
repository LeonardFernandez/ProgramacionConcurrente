as yet unclassified
accionRegistro
	| usuario exito |
	exito := inNombre isEmpty not & inApellido isEmpty not
	         & inDni isEmpty not & inContra isEmpty not.
	exito
		ifTrue: [ 
			(seleccionPlus getSeleccion)
				ifTrue: [ 
					usuario := UsuarioPlus
						           crearNombre: inNombre
						           apellido: inApellido
						           dni: inDni
						           contraseña: inContra ]
				ifFalse: [ 
					usuario := Usuario
						           crearNombre: inNombre
						           apellido: inApellido
						           dni: inDni
						           contraseña: inContra ].
			sistema agregarUsuario: usuario .
		].
	^ exito.