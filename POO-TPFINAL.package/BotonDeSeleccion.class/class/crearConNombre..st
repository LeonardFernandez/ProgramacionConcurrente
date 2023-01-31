as yet unclassified
crearConNombre: n
	|seleccion|
	seleccion := self new.
	seleccion label: n asMorph.
	seleccion extent: 100@20.
	^seleccion .