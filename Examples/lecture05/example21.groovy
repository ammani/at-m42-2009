// Unexpected switch behaviour.

def n = 2
switch (n) {
	case 1: println 'One'
	case 2: println 'Two'
	case 3: println 'Three'
	case 4: println 'Four'
	default: println 'Default'
}
println 'End of switch'