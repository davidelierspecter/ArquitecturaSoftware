#pragma once
#include <string>

class Condimento {
protected:
	float costo;
	std::string nombre;

private:
	Condimento* wrappee;

protected:
	Condimento();

	Condimento(Condimento* wrappee);

public:
	void imprimirCostoDelCondimento();

};