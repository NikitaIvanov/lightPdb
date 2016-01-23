# lightPdb
This is light java library for pdb file format

How to use it:<br><code lang="java">
    InputStream is = ... ;<br>
    BufferedReader reader = new BufferedReader(new InputStreamReader(is));<br>
    String line;<br>
    Molecule molecule = new Molecule();<br>
    while((line=reader.readLine())!=null) {<br>
      String begin = line.substring(0,6).trim();<br>
      switch(begin) {<br>
        case "ATOM" : {<br>
          molecule.addAtom(new Atom(line));<br>
          break;<br>
        }<br>
        case "HETATM" : {<br>
          molecule.addAtom(new Hetatm(line));<br>
          break;<br>
        }<br>
        case "CONECT" : {<br>
          molecule.addConect(new Conect(line));<br>
          break;<br>
        }<br>
      }<br>
    }<br>
</code>
