package main

import (
	"fmt"
	"math"
)

/* Violating the principal
type circle struct {
	radius float64
}

func (c circle) area() {
	// violating Single Responsibility Principle
	fmt.Printf("circle area: %f\n", math.Pi*c.radius*c.radius)
}

func main() {

	c := circle{
		radius: 3,
	}
	c.area()

}
*/
// lets not violate the principal
type circle struct {
	radius float64
}

func (c circle) area() float64 {
	return math.Pi * c.radius * c.radius
}
func output(value float64) {
	fmt.Printf("circle are :%f\n", value)
}
func main() {

	c := circle{
		radius: 3,
	}
	area := c.area()
	output(area)

}
