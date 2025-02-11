#pragma once
#include "Condimento.h"

class BebidaDecorable {
private:
	Condimento* condimentos;

protected:
	float costoBase;

protected:
	BebidaDecorable();
	BebidaDecorable(Condimento* condimento);

public:
	void imprimirCostos();
};