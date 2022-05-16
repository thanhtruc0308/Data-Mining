package weka.api;

import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class AssocRules {
	public static void main(String args[]) throws Exception {
		// load dataset
		String dataset = "E:/2021-2022/sem2 2021-2022/DataMining/project/Preprocess.arff";
		DataSource source = new DataSource(dataset);
		//get instances object
		Instances data = source.getDataSet();
		//the Apriori algorithm
		Apriori model = new Apriori();
		model.buildAssociations(data);
		//print out the extracted rules
		System.out.print(model);
	}
}
