//
//  ViewController.swift
//  PhotoFilter
//
//  Created by Julio Figueroa on 11/1/15.
//  Copyright © 2015 Julio Figueroa. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var PhotoImageView: UIImageView!
    
    // Create a place to render the filtered image
    let context = CIContext(options: nil)

    @IBAction func ApplyFilter(sender: AnyObject) {
        
        //Create an image to filter
        let inputImage = CIImage(image: PhotoImageView.image )
        
        //Create a random color to pass to a filter
        let randomColor = [kCIInputAngleKey: (Double(arc4random_uniform(314)) / 100) ]
        
        //Apply a Filter to the image
        let filteredImage = inputImage.imageByApplyingFilter("CIHueAdjust", withInputParameters: randomColor)
    
        //Render the filter to the image
        let renderedImage = context.createCGImage(filteredImage, fromRect: filteredImage.extent())
        
        //Render the filter change back in the interface
        photoImageView.image = UIImage(CGImage: renderedImage)
        
        
    }// End of action button for Apply Filter
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

