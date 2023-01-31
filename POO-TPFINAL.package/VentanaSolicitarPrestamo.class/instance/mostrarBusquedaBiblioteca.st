as yet unclassified
mostrarBusquedaBiblioteca
	|inNombre tituloNombre botBuscarBiblio|
	inNombre := Input crearInput .
	inNombre position: 500@550.
	tituloNombre := 'Ingrese nombre de la biblioteca' asMorph .
	tituloNombre position: inNombre position+(0@(-25)).
	botBuscarBiblio := BotonAccion crearConNombre: 'Buscar' dimension: 150@35 color: Color black .
	botBuscarBiblio position: inNombre position+(0@50).
	self addMorph: inNombre .
	self addMorph: tituloNombre .
	self addMorph: botBuscarBiblio .
	botBuscarBiblio mouseAction: [ self mostrarBusquedaLibro  ].