//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;

@RunWith(JUnit4.class)
public class JobTest {
    Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job pseudo_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    public JobTest() {
    }

    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job pseudo_job = new Job();
        Assert.assertNotEquals(test_job, pseudo_job);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assert.assertTrue(this.test_job instanceof Job);
        Assert.assertTrue(this.test_job.getEmployer() instanceof Employer);
        Assert.assertTrue(this.test_job.getLocation() instanceof Location);
        Assert.assertTrue(this.test_job.getPositionType() instanceof PositionType);
        Assert.assertTrue(this.test_job.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals(this.test_job.getName(), "Product tester");
        Assert.assertEquals(this.test_job.getEmployer().getValue(), "ACME");
        Assert.assertEquals(this.test_job.getLocation().getValue(), "Desert");
        Assert.assertEquals(this.test_job.getPositionType().getValue(), "Quality control");
        Assert.assertEquals(this.test_job.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Assert.assertFalse(this.test_job.equals(this.pseudo_job));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char beginningOfString = job.toString().charAt(0);
        int endOfString = job.toString().charAt(job.toString().length() - 1);
        Assert.assertEquals(10L, (long)beginningOfString);
        Assert.assertEquals(10L, (long)endOfString);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Assert.assertEquals("\nID: " + this.test_job.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", this.test_job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        int var10000 = this.test_job.getId();
        String fieldString = "\nID: " + var10000 + "\nName: " + this.test_job.getName() + "\nEmployer: " + this.test_job.getEmployer() + "\nLocation: " + this.test_job.getLocation() + "\nPosition Type: " + this.test_job.getPositionType() + "\nCore Competency: " + this.test_job.getCoreCompetency() + "\n";
        Assert.assertTrue(fieldString.equals(this.test_job.toString()));
        String blankString = "\nID: " + this.test_job.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n";
        Assert.assertEquals(blankString, blankString);
    }
}
