Propio del tipo
entrarBar

	"comment stating purpose of instance-side method"
	| exito |
	exito:=false.
	(self esMayor)
	ifTrue:[ enBar:=true. exito:=true].
	^exito. 


	