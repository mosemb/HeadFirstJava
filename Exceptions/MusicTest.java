import javax.sound.midi.*; 

public class MusicTest {

  public void play(int instrument, int note){
  
      try{
      
          Sequencer player =  MidiSystem.getSequencer(); 
          player.open(); 
          
          Sequence seq = new Sequence(Sequence.PPQ, 4); // This is the sequence constructor
          
          Track track = seq.createTrack();  // Ask the sequence for the track
          
          MidiEvent event = null; 
          
          ShortMessage first = new ShortMessage(); 
          first.setMessage(192, 1, instrument,0); 
          MidiEvent changeInstrument = new MidiEvent(first,1);
          track.add(changeInstrument); 
      
          
          // Add Midi events into the track 
          ShortMessage a = new ShortMessage(); 
          a.setMessage(144, 1, note, 100);
          MidiEvent noteOn = new MidiEvent(a,1);
          track.add(noteOn);
          
          ShortMessage b = new ShortMessage(); 
          b.setMessage(128,1,note,100); 
          MidiEvent noteOff = new MidiEvent(b,30);
          track.add(noteOff);
          
          player.setSequence(seq); 
          player.start();  
          
          
           
          System.out.println("Sucessfully got sequencer");  
      
      }catch(Exception ex){
         
         ex.printStackTrace(); 
        //System.out.println("Bummer"); 
      
      
      }
  
  }


}
