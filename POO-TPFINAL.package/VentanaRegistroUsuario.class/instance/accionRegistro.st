as yet unclassified
accionRegistro
	((inNombre isEmpty not) & (inApellido isEmpty not) & (inDni isEmpty not) & (inContra isEmpty not))
	ifTrue:[
		|usuario|
		usuario:=Usuario crearNombre: inNombre  apellido: inApellido  dni: inDni   contraseña: inContra ]
	ifFalse:[].