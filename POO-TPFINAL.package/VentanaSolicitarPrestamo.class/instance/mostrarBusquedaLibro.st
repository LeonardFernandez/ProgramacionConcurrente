as yet unclassified
mostrarBusquedaLibro
	|inId tituloId botBuscarLibro|
	inId := Input crearInput .
	inId position: 1000@300.
	tituloId := 'Ingrese id del Libro' asMorph .
	tituloId position: inId position+(0@(-25)).
	botBuscarLibro := BotonAccion crearConNombre: 'Buscar' dimension: 150@35 color: Color black .
	botBuscarLibro position: inId position+(0@50).
	self addMorph: inId .
	self addMorph: tituloId .
	self addMorph: botBuscarLibro.