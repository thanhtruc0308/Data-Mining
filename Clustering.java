package weka.api;

import weka.clusterers.ClusterEvaluation;
import weka.clusterers.DBScan;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Clustering {
	public static void main(String args[]) throws Exception {
		String dataset = "E:/2021-2022/sem2 2021-2022/DataMining/project/Preprocess.arff";
		DataSource source = new DataSource(dataset);
		Instances data = source.getDataSet();
		DBScan model = new DBScan();
		model.buildClusterer(data);
		System.out.println(model);

		ClusterEvaluation clsEval = new ClusterEvaluation();
		String dataset1 = "E:/2021-2022/sem2 2021-2022/DataMining/project/Preprocess.arff";
		DataSource source1 = new DataSource(dataset1);
		Instances data1 = source1.getDataSet();
		clsEval.setClusterer(model);
		clsEval.evaluateClusterer(data1);
		System.out.println("# of clusters: " + clsEval.getNumClusters());
		System.out.println("Clustered Intances: " + clsEval.clusterResultsToString());
	}

}
