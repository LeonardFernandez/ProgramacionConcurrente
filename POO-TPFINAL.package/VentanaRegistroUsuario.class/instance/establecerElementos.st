initialization
establecerElementos
	|tituloNombre|
	inNombre := Input crearInput .
	inNombre position: 500@500.
	self addMorph: inNombre .
	tituloNombre := 'Ingrese nombre' asMorph .
	tituloNombre position: inNombre position+(0@(-25)).
	self addMorph: tituloNombre .
	
		