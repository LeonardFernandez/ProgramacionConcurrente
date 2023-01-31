initialization
establecerElementos 
	|inDni inContra tituloDni tituloContra botBuscar|
	inDni := Input crearInput .
	inContra := Input crearInput .
	botBuscar := BotonAccion crearConNombre: 'Buscar' dimension: 150@35 color: Color black .
	tituloDni := 'Ingrese DNI del usuario solicitante' asMorph .
	tituloContra := 'Ingrese contraseña del usuario' asMorph .
	inDni position: 500@300.
	inContra position: inDni position+(0@(75)).
	tituloDni position: inDni position+(0@(-25)).
	tituloContra position: inContra position+(0@(-25)).
	botBuscar position: inContra position+(0@(50)).
	
	self addMorph: inDni .
	self addMorph: inContra .
	self addMorph: tituloDni .
	self addMorph: tituloContra .
	self addMorph: botBuscar .
	botBuscar mouseAction: [ self mostrarBusquedaBiblioteca  ].