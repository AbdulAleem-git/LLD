package main

import "fmt"

type IsportsFactory interface {
	makeShoe() Ishoe
	makeShirt() IShirt
}

func getSportsFactory(brand string) (IsportsFactory, error) {
	if brand == "adidas" {
		return &Adidas{}, nil
	}

	if brand == "nike" {
		return &Nike{}, nil
	}

	return nil, fmt.Errorf("Wrong brand type passed")
}
