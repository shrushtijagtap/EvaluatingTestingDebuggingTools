package com.milaboratory.core.alignment.kaligner2;

import com.milaboratory.core.alignment.AffineGapAlignmentScoring;
import com.milaboratory.core.alignment.Alignment;
import com.milaboratory.core.alignment.AlignmentUtils;
import com.milaboratory.core.alignment.benchmark.*;
import com.milaboratory.core.mutations.Mutations;
import com.milaboratory.core.mutations.generator.MutationModels;
import com.milaboratory.core.mutations.generator.MutationsGenerator;
import com.milaboratory.core.mutations.generator.NucleotideMutationModel;
import com.milaboratory.core.sequence.NucleotideSequence;
import com.milaboratory.test.TestUtil;
import com.milaboratory.util.GlobalObjectMappers;
import com.milaboratory.util.RandomUtil;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static com.milaboratory.core.alignment.AffineGapAlignmentScoring.IGBLAST_NUCLEOTIDE_SCORING;
import static com.milaboratory.core.alignment.AffineGapAlignmentScoring.IGBLAST_NUCLEOTIDE_SCORING_THRESHOLD;
import static com.milaboratory.core.alignment.benchmark.ChallengeProvider.getParamsOneCluster;
import static com.milaboratory.test.TestUtil.its;

public class EvosuiteKAligner2Test {

}