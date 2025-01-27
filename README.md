# Evaluating Testing and Debugging Tools on Real-world Bugs

### 🚀 Project Overview

This repository presents our exploration of **automated testing and debugging techniques** using real-world bug datasets. The primary focus was to evaluate how well tools like **Randoop** and **EvoSuite** perform in identifying and localizing bugs, automating workflows, and improving debugging efficiency.  

The work significantly reduces debugging time and offers a robust framework for **bug localization**, ensuring software reliability. 

---

### 📋 Key Features

1. **Automated Test Generation**  
   - **Randoop**: Feedback-directed random test generation for error-revealing and regression tests.  
   - **EvoSuite**: Automatic test suite generation using genetic evolution algorithms to optimize coverage.

2. **Bug Localization Techniques**  
   - Calculation of **suspiciousness scores** for code statements to rank potential bug-causing elements.  
   - Advanced ranking methods for pinpointing faulty code sections with high precision.

3. **Benchmarking Bug Datasets**  
   - Worked with datasets like **Defects4J**, **Bears**, **BugSwarm**, and **QuixBugs**, including over 835+ bugs.
   - Extracted and analyzed metrics such as code coverage, complexity changes, and similarity distances.

4. **Automation & Efficiency**  
   - Scripts developed to automate tasks like bug extraction, test generation, benchmarking, and visualization.
   - Achieved a **95% reduction in debugging time** through automated workflows and advanced tools.

---

### 🛠️ Tools & Frameworks

- **Datasets**: Defects4J, Bears, BugSwarm, QuixBugs.  
- **Testing Tools**: Randoop, EvoSuite.  
- **Code Coverage Tools**: Clover, Cobertura.  
- **Localization Metrics**: Suspiciousness score calculation, AR (Average Rank), FR (First Rank).  
- **Visualization**: Scatter plots, regression analysis using Python and Dash-Plotly.

---

### 📂 Datasets and Results

- **Bug Versions**: Each bug includes both buggy and patched versions.  
- **Test Generation Success**:
  - High precision in exposing buggy code through **cross-testing**.  
  - Coverage reports for each bug generated using **Clover** and **Jacoco**.

- **Metrics Tracked**:  
  - Classes, lines, and methods changed.  
  - Cyclomatic complexity, Levenshtein distances, and CodeBLEU scores.  

- **Localization Results**:  
  - Average Rank and First Rank computed for pinpointing buggy statements.  
  - Significant insights into tool performance on datasets like **QuixBugs** and **Bears**.

---


### 📎 Links

- [Report](https://drive.google.com/file/d/1rjaWIFTPgTwsIduqUMYGL7V2DrWls0m8/view)
