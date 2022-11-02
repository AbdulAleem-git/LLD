package main

// creating chair interface
type chair interface {
	hasLegs() int
	sitOn() string
}

// to implement different type of chair we are defining deferent struct
type victorianChair struct{}
type modernChair struct{}

// this is the problem with the simple design pattern that we have to
// implement as number of method as the variants are.
// will solve this problem by usin abstract factory
func (v *victorianChair) hasLegs() int {
	return 4
}
func (v *modernChair) hasLegs() int {
	return 5
}
func (v *victorianChair) sitOn() string {
	return "Having more methods to siton"
}
func (v *modernChair) sitOn() string {
	return "only one way but it moves around"
}
