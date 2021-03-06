package br.org.fieb.heijunka.algorithm;

import br.org.fieb.heijunka.model.Demand;
import br.org.fieb.heijunka.model.WorkSchedule;

public interface IHeijunkaStrategy {
	
	public Integer[][] leveling(Demand demandMap, WorkSchedule workScheduleMap) throws InvalidHeijunkaInputException;

}
