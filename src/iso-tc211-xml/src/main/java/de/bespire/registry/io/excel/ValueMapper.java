package de.bespire.registry.io.excel;

public interface ValueMapper<I, O> {
	O map(I value);
	I mapInverse(O value);
}
