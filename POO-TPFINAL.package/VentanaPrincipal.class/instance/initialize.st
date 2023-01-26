initialization
initialize 
	|titulo|
	super initialize .
	titulo := 'Sistema Gestor de Bibliotecas' asMorph .
	self addMorph: titulo .
	titulo position: self position .
	self addMorph: titulo.
	botRegistrarUsuario := BotonAccion crearConNombre: 'Registrar Usuario' dimension: 200@50 color: Color black . 
	botSolicitarPrestamo := BotonAccion crearConNombre: 'Solicitar Prestamo' dimension: 200@50 color: Color black.
	botDevolverPrestamo  := BotonAccion crearConNombre: 'Devolver Prestamo' dimension: 200@50 color: Color black.
	botCambiarMembresia  := BotonAccion crearConNombre: 'Cambiar Membresia' dimension: 200@50 color: Color black.
	botInfoUsuario  := BotonAccion crearConNombre: 'Informacion Usuarios' dimension: 200@50 color: Color black.
	botInfoBiblioteca  := BotonAccion crearConNombre: 'Informacion Bibliotecas' dimension: 200@50 color: Color black.
	botAgregarBiblio  := BotonAccion crearConNombre: 'Agregar Biblioteca' dimension: 200@50 color: Color black.
	self addMorph: botRegistrarUsuario .
	self addMorph: botSolicitarPrestamo .
	self addMorph: botDevolverPrestamo .
	self addMorph: botCambiarMembresia .
	self addMorph: botInfoUsuario .
	self addMorph: botInfoBiblioteca .
	self addMorph: botAgregarBiblio .
	botRegistrarUsuario position: self position+(510@(150)) .
	botSolicitarPrestamo position: botRegistrarUsuario position+(0@(75)).
	botDevolverPrestamo position: botSolicitarPrestamo position+(0@(75)).
	botCambiarMembresia  position: botDevolverPrestamo position+(0@(75)).
	botInfoUsuario  position: botCambiarMembresia position+(0@(75)).
	botInfoBiblioteca  position: botInfoUsuario position+(0@(75)).
	botAgregarBiblio  position: botInfoBiblioteca position+(0@(75)).
	botRegistrarUsuario mouseAction: [ ventanaRegistroUsuario := VentanaRegistroUsuario new ].