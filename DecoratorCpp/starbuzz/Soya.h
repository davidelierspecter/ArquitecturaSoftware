#pragma once
#include "Condimento.h"

class Soya : public Condimento {
public:
	Soya();
	Soya(Condimento* wrappee);
};