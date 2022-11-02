package main

type chair struct{}
type sofa struct{}
type coffeeTable struct{}
type furnitureFactory interface {
	createChair() chair
	createSofa() sofa
	createCoffeeTable() coffeeTable
}
type victorianChairFactory struct{}
type modernChairFactory struct{}
