#include <iostream>
#include "Condimento.h"

Condimento::Condimento() {
	wrappee = nullptr;
}

Condimento::Condimento(Condimento* wrappee) {
	this->wrappee = wrappee;
}

void Condimento::imprimirCostoDelCondimento() {
	std::cout << nombre << ": $" << costo << " " << std::endl;
	if (wrappee) wrappee->imprimirCostoDelCondimento();
}