initialization
initialize 
	"comment stating purpose of instance-side method"
	super initialize .
	self color: Color darkGray. 
	self position: 45@45.
	self bounds: (self position extent: 1800@900).
	"Botones"
	botRegistrarUsuario := BotonAccion crearConNombre: 'Registrar Usuario' dimension: 200@50 color: Color black . 
	botSolicitarPrestamo := BotonAccion crearConNombre: 'Solicitar Prestamo' dimension: 200@50 color: Color black.
	botDevolverPrestamo  := BotonAccion crearConNombre: 'Solicitar Prestamo' dimension: 200@50 color: Color black.
	botCambiarMembresia  := BotonAccion crearConNombre: 'Cambiar Membresia' dimension: 200@50 color: Color black.
	botInfoUsuario  := BotonAccion crearConNombre: 'Informacion Usuarios' dimension: 200@50 color: Color black.
	botInfoBiblioteca  := BotonAccion crearConNombre: 'Informacion Bibliotecas' dimension: 200@50 color: Color black.
	botAgregarBiblio  := BotonAccion crearConNombre: 'Agregar Biblioteca' dimension: 200@50 color: Color black.
	botCerrar := BotonAccion crearConNombre: 'X' dimension: 50@50 color: Color black.
	self addMorph: botCerrar .
	self addMorph: botRegistrarUsuario .
	self addMorph: botSolicitarPrestamo .
	self addMorph: botDevolverPrestamo .
	self addMorph: botCambiarMembresia .
	self addMorph: botInfoUsuario .
	self addMorph: botInfoBiblioteca .
	self addMorph: botAgregarBiblio .
	botCerrar position: 1750@50.
	botRegistrarUsuario position: 100@200.
	botSolicitarPrestamo position: 100@275.
	botDevolverPrestamo position: 100@350.
	botCambiarMembresia  position: 100@425.
	botInfoUsuario  position: 100@500.
	botInfoBiblioteca  position: 100@575.
	botAgregarBiblio  position: 100@650.
	botCerrar mouseAction: [self cerrar].